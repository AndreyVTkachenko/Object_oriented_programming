I — Interface Segregation (Принцип разделения интерфейсов)

Не следует ставить клиент в зависимость от методов, которые он не использует.

Когда классу приходится производить действия, не несущие никакой реальной пользы, это выливается в пустую трату ресурса,
а в случае, если класс выполнять эти действия не способен, ведёт к возникновению багов.
Класс должен производить только те операции, которые необходимы для осуществления его функций. Все другие действия
следует либо удалить совсем, либо переместить, если есть вероятность, что они понадобятся другому классу в будущем.

Назначение
Принцип служит для того, чтобы раздробить единый набор действий на ряд наборов поменьше – таким образом, каждый класс
делает то, что от него действительно требуется, и ничего больше.