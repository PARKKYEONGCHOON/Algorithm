#include <iostream>
#include <forward_list>
#include <vector>
#include <string>



int main()
{
	std::vector<std::string> vec = { "L","L","N","S","L","S","S","S","F" };

	auto it = vec.begin();
	std::cout << "가장 최근 우승: " << *it << std::endl;

	it += 8;
	std::cout << "8년 전 우승: "  << *it << std::endl;

	advance(it, -3);
	std::cout << "그 후 3년 뒤 우승: " << *it << std::endl;

	std::forward_list<std::string> fwd(vec.begin(), vec.end());

	auto it1 = fwd.begin();

	std::cout << "가장 최근 우승: " << *it1 << std::endl;

	advance(it, 5);
	std::cout << "그 후 5년 전 우승: " << *it1 << std::endl;

	return 0;
}