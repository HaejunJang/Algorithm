class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //각 행렬의 크기값을 변수로 저장
        //결과 행렬 생성
        // 반복문 돌면서 값을 곱해서 반환
        int x1 = arr1.length;
        int y1 = arr1[0].length;
        int x2 = arr2.length;
        int y2 = arr2[0].length;
        int[][] answer=  new int[x1][y2];
        for(int i=0; i<x1; i++) {
            for(int j=0; j<y2; j++) {
                for (int k=0; k<y1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                    // System.out.print(" i 값: " + i + " j값: " + j  + " k값:"+ k);
                }
                // System.out.println();
            }
        }
        return answer;
    }
}