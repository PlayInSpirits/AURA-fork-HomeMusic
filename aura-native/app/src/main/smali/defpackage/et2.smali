.class public final synthetic Ldefpackage/et2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/it2;
.implements Ldefpackage/wc0;


# instance fields
.field public final synthetic n:Ldefpackage/j60;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/j60;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/et2;->n:Ldefpackage/j60;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/et2;->n:Ldefpackage/j60;

    .line 2
    .line 3
    check-cast p1, Ldefpackage/al3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/j60;->h(Ldefpackage/qi3;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Ldefpackage/tn2;Ldefpackage/fr2;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/et2;->n:Ldefpackage/j60;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/j60;->j:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/lu3;

    .line 9
    .line 10
    iget-object p3, p1, Ldefpackage/tn2;->e:Ldefpackage/pq;

    .line 11
    .line 12
    iget-object v0, p1, Ldefpackage/tn2;->k:Ldefpackage/kn2;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ldefpackage/tn2;->B(Ldefpackage/fr2;)Ldefpackage/fr2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ldefpackage/kn2;->a()Ldefpackage/qi3;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-interface {p2}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p2, p2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v0, p1, p2, p0}, Ldefpackage/pq;->e(Ldefpackage/kn2;Ldefpackage/fr2;Ljava/lang/String;Ldefpackage/lu3;)Ldefpackage/ic2;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
