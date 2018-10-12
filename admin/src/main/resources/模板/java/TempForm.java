package #{path}.validator;

import #{path}.domain.#{obj};
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class #{obj}Form extends #{obj} implements Serializable {
    @NotEmpty(message = "标题不能为空")
    private String title;
}
