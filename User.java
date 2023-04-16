package april;
import java.util.Objects;
	public class User implements Comparable<User> {
		 private int id;
		    private String name;
		    
		    User(int id, String name){
		        this.id=id;
		        this.name=name;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    @Override
		    public String toString() {
		        return "User [id=" + id + ", name=" + name + "]";
		    }

		    @Override
		    public int hashCode() {
		        return Objects.hash(id, name);
		    }

		    @Override
		    public boolean equals(Object obj) {
		        if (this == obj)
		            return true;
		        if (obj == null)
		            return false;
		        if (getClass() != obj.getClass())
		            return false;
		        User other = (User) obj;
		        return id == other.id && Objects.equals(name, other.name);
		    }
		    
		    @Override
		    public int compareTo(User o) {
		        if(this.id<o.id) {
		            return -1;
		        }else if(this.id>o.id) {
		            return 1;
		        }else {
		            return 0;
		        }
		        
		    }

		}
