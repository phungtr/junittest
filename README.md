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

1. Sao chép kho lưu trữ vào máy cục bộ của bạn.
2. Điều hướng đến thư mục dự án.
3. Chạy kiểm thử bằng Maven bằng cách thực hiện lệnh sau:
![image](https://github.com/user-attachments/assets/9bd73429-cbca-42e5-80ad-0382b48d1ca8)

## Project Structure

![image](https://github.com/user-attachments/assets/7e07f1c8-9193-4af4-bbb2-e606f8019c3b)

### `App.java`.

![image](https://github.com/user-attachments/assets/d261839a-74d1-4c21-8bda-80238977f0eb)

![image](https://github.com/user-attachments/assets/39690606-8c7f-46c7-8b3c-6dd60a243906)

![image](https://github.com/user-attachments/assets/18b1c22d-15b1-4df6-b116-6ca6002c37f1)

### `AppTest.java`

![image](https://github.com/user-attachments/assets/ddf42a69-8e41-4214-aec5-bb83bc6b6c70)

![image](https://github.com/user-attachments/assets/a76aa584-42fa-4886-8365-93541331e347)

![image](https://github.com/user-attachments/assets/0670db55-b293-4893-b668-320d5ef15a95)

liên kết chatgpt: https://chatgpt.com/c/677dd2ee-c2e0-8012-ab41-3d2e82958c53
