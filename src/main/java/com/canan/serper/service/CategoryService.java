package com.canan.serper.service;

        import com.canan.serper.entity.Category;
        import com.canan.serper.repository.CategoryRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategory(){
        return categoryRepository.findAll();
    }
}
