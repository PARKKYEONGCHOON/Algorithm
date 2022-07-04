#include <string>
#include <iostream>
#include <forward_list>

struct citizen
{
	std::string name;
	int age;
};

std::ostream &operator<<(std::ostream &os, const citizen &c)
{
	return (os << "[" << c.name << ", " << c.age << "]");
}

int main()
{
	std::forward_list<citizen> citizens = { {"kim" , 22}, { "lee" , 25 }, { "park" , 18 }, { "jin" , 16 } };
	
	auto citizen_copy = citizens;

	std::cout << "��ü �ùε�: ";
	for(const auto&c : citizens)
		std::cout << c << " ";
	std::cout << std::endl;



	citizens.remove_if([](const citizen &c) {

		return (c.age < 19);
	});

	std::cout << "��ǥ�� ���� �ùε�: ";
	for (const auto&c : citizens)
		std::cout << c << " ";
	std::cout << std::endl;


	citizen_copy.remove_if([](const citizen &c) {

		return (c.age != 18);
		});

	std::cout << "���⿡ ��ǥ���� ����� �ùε�: ";
	for (const auto&c : citizen_copy)
		std::cout << c << " ";
	std::cout << std::endl;

}