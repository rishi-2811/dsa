class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer,List<Long>> xpos=new HashMap<>();
        HashMap<Integer,List<Long>> ypos=new HashMap<>();
        Set<Long> s=new HashSet<>();
        for(int[] b:buildings){
            int x=b[0];
            int y=b[1];
           long pos = (long)x * n + y;
            s.add(pos);
            if(!xpos.containsKey(x)){
                xpos.put(x,new ArrayList<>());
            }
            xpos.get(x).add(pos);
            if(!ypos.containsKey(y)){
                ypos.put(y,new ArrayList<>());
            }
            ypos.get(y).add(pos);
        }
        for(int k:xpos.keySet()){
            List<Long> a=xpos.get(k);
            Collections.sort(a);
            s.remove(a.get(0));
            s.remove(a.get(a.size()-1));
        }
        for(int k:ypos.keySet()){
            List<Long> a=ypos.get(k);
            Collections.sort(a);
            s.remove(a.get(0));
            s.remove(a.get(a.size()-1));
        }
        return s.size();
    }
}