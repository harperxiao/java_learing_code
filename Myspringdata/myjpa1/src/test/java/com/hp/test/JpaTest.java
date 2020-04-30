package com.hp.test;

import com.hp.domain.Customer;
import com.hp.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class JpaTest {

    @Test
    public void testFindAll() {
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        String jpql = "from Customer ";
        Query query = em.createQuery(jpql);


        List list = query.getResultList();

        for (Object obj : list) {
            System.out.println(obj);
        }

        tx.commit();
        em.close();
    }


    @Test
    public void testOrders(){
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        String jpql = "from Customer order by custId desc";
        Query query = em.createQuery(jpql);


        List list = query.getResultList();

        for (Object obj : list) {
            System.out.println(obj);
        }

        tx.commit();
        em.close();
    }


    @Test
    public void testCount(){
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        String jpql = "select count(custId) from Customer";
        Query query = em.createQuery(jpql);


        Object result = query.getSingleResult();

        System.out.println(result);


        tx.commit();
        em.close();
    }

    @Test
    public void testPaged(){
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        String jpql = "from Customer";
        Query query = em.createQuery(jpql);

        query.setFirstResult(0);
        query.setMaxResults(2);


        List list = query.getResultList();

        for (Object obj : list) {
            System.out.println(obj);
        }

        tx.commit();
        em.close();
    }

    @Test
    public void testCondition(){
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        String jpql = "from Customer where custName like ?";
        Query query = em.createQuery(jpql);

        query.setParameter(1,"小%");


        List list = query.getResultList();

        for (Object obj : list) {
            System.out.println(obj);
        }

        tx.commit();
        em.close();
    }


    @Test
    public void testSave(){
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Customer customer = new Customer();
        customer.setCustName("传智播客");
        customer.setCustIndustry("教育");

        em.persist(customer);

        tx.commit();
        em.close();
    }

    @Test
    public void testFind(){
        EntityManager em = JpaUtils.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Customer customer = em.find(Customer.class, 1l);

        System.out.println(customer);
        tx.commit();
        em.close();
    }

    @Test
    public  void testReference() {
        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        //3.增删改查 -- 根据id查询客户
        /**
         * getReference : 根据id查询数据
         *      class：查询数据的结果需要包装的实体类类型的字节码
         *      id：查询的主键的取值
         */
        Customer customer = entityManager.getReference(Customer.class, 1l);
//        System.out.print(customer);
        //4.提交事务
        tx.commit();
        //5.释放资源
        entityManager.close();
    }

    @Test
    public  void testRemove() {
        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        //3.增删改查 -- 删除客户

        //i 根据id查询客户
        Customer customer = entityManager.find(Customer.class,1l);
        //ii 调用remove方法完成删除操作
        entityManager.remove(customer);

        //4.提交事务
        tx.commit();
        //5.释放资源
        entityManager.close();
    }

    @Test
    public  void testUpdate() {
        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        //3.增删改查 -- 更新操作

        //i 查询客户
        Customer customer = entityManager.find(Customer.class,2l);
        //ii 更新客户
        customer.setCustIndustry("it教育");
        entityManager.merge(customer);

        //4.提交事务
        tx.commit();
        //5.释放资源
        entityManager.close();
    }

}
