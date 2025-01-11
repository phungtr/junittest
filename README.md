# JUnit Example Project

## Mô tả

Dự án này là một ví dụ về việc sử dụng JUnit để kiểm thử các phương thức trong Java. Các phương thức này bao gồm các thuật toán sắp xếp (QuickSort), tìm kiếm nhị phân (Binary Search), kiểm tra số nguyên tố (Prime Check), kiểm tra Palindrome và tìm kiếm theo chiều sâu (DFS). Các bài kiểm tra được viết bằng JUnit 5.

### Các tính năng chính:
- **QuickSort**: Kiểm thử thuật toán sắp xếp QuickSort trên các mảng số nguyên.
- **Binary Search**: Kiểm tra tìm kiếm nhị phân trên các mảng đã được sắp xếp.
- **Prime Check**: Kiểm tra xem một số có phải là số nguyên tố hay không.
- **Palindrome Check**: Kiểm tra xem một chuỗi có phải là palindrome không.
- **DFS**: Kiểm tra thuật toán tìm kiếm theo chiều sâu (Depth First Search) trên đồ thị.

## Các Bài Kiểm Tra

### 1. **QuickSort**
- Kiểm tra thuật toán sắp xếp với mảng ngẫu nhiên, mảng rỗng và mảng với một phần tử.
- Kiểm tra mảng đã sắp xếp để đảm bảo thuật toán hoạt động chính xác.

### 2. **Binary Search**
- Kiểm tra tìm kiếm nhị phân với các giá trị có trong mảng đã sắp xếp.
- Kiểm tra tìm kiếm trong mảng rỗng.
- Kiểm tra tìm kiếm với mảng chỉ có một phần tử.

### 3. **Prime Check**
- Kiểm tra với các số nguyên tố và không phải nguyên tố.
- Kiểm tra với số âm và số không để đảm bảo phương thức hoạt động chính xác.

### 4. **Palindrome Check**
- Kiểm tra chuỗi là palindrome (ví dụ: "radar").
- Kiểm tra chuỗi không phải palindrome (ví dụ: "hello").
- Kiểm tra với chuỗi có ký tự đặc biệt và chuỗi rỗng.

### 5. **DFS (Depth First Search)**
- Kiểm tra thuật toán DFS với đồ thị có nhiều nút và cạnh.
- Kiểm tra với đồ thị chỉ có một nút.
- Kiểm tra với đồ thị rỗng.

## Cài Đặt và Chạy Thử

### 1. Cài Đặt JDK
Cài đặt JDK phiên bản 11 hoặc cao hơn.

### 2. Cài Đặt Maven
Cài đặt Maven để quản lý dự án và các phụ thuộc.

### 3. Clone Repository
Clone repository này về máy tính của bạn.
git clone https://github.com/phungtr/junittest.git

## Requirements

- Java 22
- JUnit 5
- Maven (for project management)

## Running Tests

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the tests using Maven by executing the following command:
![image](https://github.com/user-attachments/assets/9bd73429-cbca-42e5-80ad-0382b48d1ca8)

## Project Structure


