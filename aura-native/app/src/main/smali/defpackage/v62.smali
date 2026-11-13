.class public final Ldefpackage/v62;
.super Ldefpackage/ef2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic N:Ldefpackage/w62;


# direct methods
.method public constructor <init>(Ldefpackage/w62;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/v62;->N:Ldefpackage/w62;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ldefpackage/ef2;-><init>(Ldefpackage/f63;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final X(Ldefpackage/pp1;)I
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ldefpackage/zz1;->a(Ldefpackage/cf2;Ldefpackage/pp1;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Ldefpackage/ef2;->M:Ldefpackage/p03;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Ldefpackage/p03;->g(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v0
.end method

.method public final r(J)Ldefpackage/jg3;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Ldefpackage/jg3;->R(J)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/nc0;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Ldefpackage/nc0;-><init>(J)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/v62;->N:Ldefpackage/w62;

    .line 10
    .line 11
    iget-object v1, v0, Ldefpackage/w62;->n0:Ldefpackage/u62;

    .line 12
    .line 13
    iget-object v0, v0, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/f63;->y0()Ldefpackage/ef2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p0, v0, p1, p2}, Ldefpackage/u62;->r(Ldefpackage/cf2;Ldefpackage/pi2;J)Ldefpackage/vi2;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Ldefpackage/ef2;->p0(Ldefpackage/ef2;Ldefpackage/vi2;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
