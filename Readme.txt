注意的地方
1. ymal裡面的 ddl-auto 很重要，這項的各種配置都要會用
2. pom.xml裡面要會新增依賴
3. 研究一下DTO(PersonDTO or PersonRequest(以前的稱呼)) VO(PersonVO or PersonReponse) BO(PersonBO) 的差異及用法
4. Controller和service名稱通常會對應到model
    ex:PersonController(controller) > PersonService(service) > Person(model)
5. function命名規則  動詞 + 敘述 ex addPerson
    一般會在function命名上寫上要幹嘛 ex:
    (1) addPerson (2) updatePersonById (3) deletePerson (4) findById