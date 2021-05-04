# Traveling-Countries
Gachon University's Department of Software 2019-2 Algorithm Class Project: Jinkyung Kim, Dahye Seon, Siyeon Cho, Hyeonseo Jung

- Jinkyung Kim : lxsz987@gmail.com
- Dahye Seon : 
- Siyeon Cho : chosiyeonn@gmail.com
- Hyeonseo Jung : windymay1920@gmail.com

# Subject
*Traveling Counseling*
  + Program that returns the best route for people traveling around the world
  + Enter the cities you want to go and budget, the program that tells the route in the order of short flight time within the budget
  + Input receives budget, country of origin, country of visit, etc.
  + Output is the shortest way out of the budget.

# Execution 
*Execution with GUI*

1. Choose a country to start from.
2. Select at least four countries, including origin.
3. Enter budget

- If none of the routes to the budget you entered exist, a pop-up window will be displayed stating that the path cannot be found.</br>
- If there is a path to the budget entered, print out the path that takes the least time.

# Evaluation
*Best Case*
  + If the user's budget is small enough to travel, the majority of the route is screened out from pruning.
  
*Worst Case*
  + If there is so much budget that it is irrelevant to any route, then no pruning is done from the amount, and all routes appear.


*__Drawback__*
  + There are several edges with orientation between nodes.
  + Therefore, every route that could go to the node had to be checked, and as the number of nodes increased, the time it took increased dramatically.

# Complement
  + Try new algorithm using __Backtracking__
  + Multiple edges exist between vertices -> Create adjacency matrix in three dimensions
  + Set nodes that do not meet budget conditions to dead nodes -> Prune

*Pros*
  + Calling a function Recursively -> significantly reduces running time.

*Cons*
  + Not Optimal solution

-------------
# Result Presentation
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0001.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0002.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0003.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0004.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0005.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0006.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0007.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0008.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0009.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0010.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0011.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0012.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0013.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0014.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0015.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0016.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0017.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0018.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0019.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0020.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0021.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0022.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0023.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0024.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0025.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0026.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0027.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0028.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0029.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0030.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0031.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0032.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0033.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0034.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0035.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0036.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0037.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0038.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0039.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0040.jpg">
<img src = "/img/김진경_선다혜_정현서_조시연_알고리즘결과발표_page-0041.jpg">

