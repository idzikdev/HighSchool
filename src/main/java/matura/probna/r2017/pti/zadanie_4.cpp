#include <iostream>
#include <fstream>
#include <vector>
#include <cmath>
#include <algorithm>

using namespace std;

double poleTrojkata(double a1, double a2, double b1, double b2, double c1, double c2) {
    double wynik = abs(a1*b2 + b1*c2 + c1*a2 - c1*b2 - a1*c2 - b1*a2);
    return wynik/2.0;
}

struct okrag {
    int x, y, r;
    okrag(int _x, int _y, int _r) {
        x = _x;
        y = _y;
        r = _r;
    }

    bool operator< (okrag const &O) {
        if(x < O.x)
            return true;
        else if(x == O.x) {
            if(y < O.y)
                return true;
        }
        return false;
    }
};

int main() {
    ifstream p("punkty.txt");

    vector< pair<double, double> > punkty;

    double a, b;
    while(p >> a >> b) {
        punkty.push_back(make_pair(a,b));
    }

    p.close();

    int c[4] = {0, 0, 0, 0};
    double pole = 0.0;

    for(int i = 0; i < punkty.size(); i++) {

        if(punkty[i].first > 0 && punkty[i].second > 0) {
            c[0]++;
        } else if(punkty[i].first < 0 && punkty[i].second > 0) {
            c[1]++;
        } else if(punkty[i].first < 0 && punkty[i].second < 0) {
            c[2]++;
        } else {
            c[3]++;
        }

        if(i < punkty.size() - 1) {
            pole += poleTrojkata(punkty[i].first, punkty[i].second, punkty[i+1].first, punkty[i+1].second, 0.0, 0.0);
        }
    }
    pole += poleTrojkata(punkty[punkty.size()-1].first, punkty[punkty.size()-1].second, punkty[0].first, punkty[0].second, 0.0, 0.0);

    ofstream w1("wynik1.txt"), w3("wynik3.txt");

    w1 << c[0] << " " << c[1] << " " << c[2] << " " << c[3] << endl;
    w3 << (int) pole << endl;

    w1.close();
    w3.close();

    ifstream o("okregi.txt");

    int x, y, r;

    vector<okrag> okregiStyczneDoX;

    while(o >> x >> y >> r) {
        if(abs(y) == r) {
            okregiStyczneDoX.push_back(okrag(x, y, r));
        }
    }

    o.close();

    sort(okregiStyczneDoX.begin(),okregiStyczneDoX.end());

    ofstream w2("wynik2.txt");

    for(int i = 0; i < okregiStyczneDoX.size(); i++) {
        w2 << okregiStyczneDoX[i].x << " " << okregiStyczneDoX[i].y << " " << okregiStyczneDoX[i].r << endl;
    }

    w2 << okregiStyczneDoX.size() << endl;

    w2.close();

    return 0;
}
