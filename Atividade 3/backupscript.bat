echo off
set currdate=%date:~4%
set filedate=%currdate:/=_%
"C:\Program Files\MySQL\MySQL Workbench 8.0 CE\mysqldump.exe" -u diegoluz -p 123456 uc4atividades > "C:\users\Diego Luz\documents\Projeto Integrador\Atividade 3_%filedate%.sql"