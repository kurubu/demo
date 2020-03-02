find
===
*分页查询
select id,user_name,age 
from tb_user 
limit  #page#, #size# 

add
===
*添加
insert into tb_user( user_name,age) 
set value( #userName#,#age# )  

updata
===
*更新
updata tb_user  
@if(!isEmpty(userName)) {
  user_name = #userName#,
  if  @}
@if(!isEmpty(age)) {
  age = #age#,
  if  @}
where id= #id#

del
===
*删除
delete from  tb_user where id=#id#

