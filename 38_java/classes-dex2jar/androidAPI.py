import os
import re
resultMap = {}

patt = r'import(\s)+android'

def searchAPI(root,files):
    for file in files:
        with open(root + '/' + file,'r') as f:
            for line in f.readlines():
                if re.match(patt,line):
                    if line in resultMap.keys():
                        resultMap[line].append(root+file)
                    else:
                        resultMap[line] = []
                        resultMap[line].append(root+file)

for root,dirs,files, in os.walk('./'):
    searchAPI(root,files)

os.system('touch ../result.txt')
with open('../result.txt','w+') as f:
    for key in resultMap.keys():
        f.write(key.strip()+" ".join(resultMap[key])+'\n')

os.system('touch ../API.txt')
api = []
for key in resultMap.keys():
    api.append(key)
api.sort()
with open('../API.txt','w+') as f:
    f.write("".join(api))

