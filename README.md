# properties-to-oo1

Properties to Object-oriented 1

## Grammar
```
Programa ::= "{" DecClasse ";" Comando "}"

Comando ::= Atribuicao

| ComDeclaracao

| While

| IfThenElse

| IO

| Comando ";" Comando

| Skip

| New

| ChamadaMetodo

Skip ::=

ComDeclaracao :: = "{" DecVariavel ";" Comando"}"

While ::= "while" Expressao do" "{" Comando"}"

IfThenElse ::= "if" Expressao "then" "{" Comando"}"

| "if" Expressao "then" "{" Comando"}" "else" "{" Comando"}"


ChamadaMetodo ::= Expressao "." Id "(" ListaExpressao ")" | Expressao "." Id "("")" 

ListaExpressao ::= Expressao | Expressao "," ListaExpressao

New ::= LeftExpression ":=" "new" Id

Atribuicao ::= LeftExpression ":=" Expressao

IO ::= "write" "(" Expressao ")" | "read" "(" Id ")"

Expressao ::= Valor | ExpUnaria | ExpBinaria | LeftExpression | this

Valor ::= ValorConcreto

ValorConcreto ::= ValorInteiro | ValorBooleano | ValorString | ValorNull

ExpUnaria ::= "-" Expressao | "not" Expressao | "length" Expressao

ExpBinaria ::= Expressao "+" Expressao

| Expressao "-" Expressao

| Expressao "and" Expressao

| Expressao "or" Expressao

| Expressao "==" Expressao

| Expressao "++" Expressao

LeftExpression ::= Id | AcessoAtributo

AcessoAtributo ::= LeftExpression.Id | this.Id

DecClasse ::= "classe" Id "{" DecVariavel ";" DecProcedimento "}"

| DecClasse "," DecClasse

DecVariavel ::= Tipo Id "=" Expressao "{" "get" "{" Expressao "}" "set" "{" Expressao "}" "}"

| DecVariavel "," DecVariavel

| Tipo Id ":=" "new" Id

DecProcedimento ::= "proc" Id "(" ListaDeclaracaoParametro ")" "{" Comando "}"

| DecProcedimento "," DecProcedimento

ListaDeclaracaoParametro ::= Tipo Id | Tipo Id "," ListaDeclaracaoParametro

Tipo ::= TipoClasse | TipoPrimitivo

TipoClasse ::= Id

TipoPrimitivo ::= "string" | "int" | "boolean"


```