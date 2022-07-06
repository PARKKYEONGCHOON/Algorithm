#include <iostream>
#include <forward_list>
#include <vector>
#include <string>



int main()
{
	std::vector<std::string> vec = { "L","L","N","S","L","S","S","S","F" };

	auto it = vec.begin();
	std::cout << "���� �ֱ� ���: " << *it << std::endl;

	it += 8;
	std::cout << "8�� �� ���: "  << *it << std::endl;

	advance(it, -3);
	std::cout << "�� �� 3�� �� ���: " << *it << std::endl;

	std::forward_list<std::string> fwd(vec.begin(), vec.end());

	auto it1 = fwd.begin();

	std::cout << "���� �ֱ� ���: " << *it1 << std::endl;

	advance(it, 5);
	std::cout << "�� �� 5�� �� ���: " << *it1 << std::endl;

	return 0;
}