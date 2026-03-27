import java.net.ResponseCache;

`



public class EmployyeSpring {





    @PutMapping("Emp/{id}")
    public ResponseEntity<Emplpyee> updateEmp(@Pathvarible int id, @Requestbody Employee e)
    {
            Employee updatEmployee = emplRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(""))         

            updatEmployee.setName(e.getName());;
            updatEmployee.setSalary(e.getSalary());;
            
            emplRepo.save(updatEmployee);

        return ResponseEntity.ok(updatEmployee);
    }   


    @DeleteMapping("/id")
    public ResponseEntity<String> deleteEmp(@Pathvarible int id , @Respons)

    
}
