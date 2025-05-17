class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String>li=new ArrayList<>();
        li.add(folder[0]);
        for(int i=1;i<folder.length;i++){
            String lastFolder=li.get(li.size()-1)+"/";
            if(!folder[i].startsWith(lastFolder)){
                li.add(folder[i]);
            }
        }
        return li;
    }
}