# Tarefa 016 - Expressões Regulares - 28/06/2023

1. Elaborar expressões regulares para validação dos objetos constantes da tabela a seguir:

|Objeto|Formato|Regex
|--|--|--|
|Data|dd/mm/aa|(\d{2})\/(\d{2})\/(\d{2})|
|Data|dd/mm/aaa|(\d{2})\/(\d{2})\/(\d{4})|
Data|dd/mm/aaa hh:mm:ss|(\d{2})\/(\d{2})\/(\d{4}) (\d{2}):(\d{2}):(\d{2})|
|Data|yy/mm/dd|(\d{2})\/(\d{2})\/(\d{2})|
|Data|yyyy/mm/dd|(\d{4})\/(\d{2})\/(\d{2})|
|Número decimal|dd.ddd.ddd|([1-9]{1,2}[.])?(\d{1,3}[,])(\d{1,5})|
|Nomes de Arquivos / documentos|nome.(doc,docx,xls,xlsx,pdf,csv,txt)|(.*)[.]\(doc\|docx\|xls\|xlsx\|pdf\|csv\|txt)|
|E-mail|nome@dominio|^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$
|Codigo Cor HTML ||^#([A-Fa-f0-9]{6}\|[A-Fa-f0-9]{3})$|
|Arquivo de Imagem||(.*)[.]\(jpg\|gif\|png\|jpeg\)|
|Endereco IP ||(\b25[0-5]\|\b2[0-4][0-9]\|\b[01]?[0-9][0-9]?)(\.(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)){3}|
|Arquivos Multimedia ||(.*)[.]\(swf\|mov\|wma\|jpeg\|mpg\|mp3\|wav)|
|Telefone (BR) ||([0-9]{2,3})?(\([0-9]{2}\))([0-9]{4,5})([0-9]{4})|
|Celular (BR)|(55) (62) 9834.1243|(\([0-9]{2,3}\))?(\([0-9]{2}\))([0-9]{4,5})[.]\([0-9]{4})|
|Hora|(HH:MM)|(\d{2}):(\d{2})
|Hora|(HH:MM:SS)|(\d{2}):(\d{2}):(\d{2})|
|URL||/^https?:\/\/(?:www\.)?[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b(?:[-a-zA-Z0-9()@:%_\+.~#?&\/=]*)$/|
|Domínio||/^[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9]\.[a-zA-Z]{2,}$/|
|Telefone Internacional || ^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$|

