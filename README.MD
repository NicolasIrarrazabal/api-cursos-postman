# API Cursos - Evidencia

## Endpoints probados

- **GET /api/cursos**  
- **POST /api/cursos**  

## Resultados

- Curso válido: correcto  
- Validaciones funcionando  

## Aprendizaje

Uso de `@RequestBody`, `@Valid`, `@NotNull` y `@NotBlank`  

### ¿Qué hace @RequestBody?

`RequestBody` permite a SpringBoot obtener el contenido que se envia atraves del Post.  

### ¿Para qué sirve @Valid?

`@Valid` se asegura de que los datos de un objeto sean válidos basado en las restricciones impuestas en su clase.  

### Diferencia entre @NotNull y @NotBlank

La principal diferencia entre estos dos es que `NotNull` impide que una variable sea enviada como Null y `NotBlank` impide que sea enviada con datos Vacios o en blanco.  

### ¿Por qué usamos List en vez de arreglos?

Se utiliza `List` en lugar de arreglos ya que `List` se puede agregar y editar su contenido, en cambio los arreglos tienen un tamaño fijo e inmutable.
