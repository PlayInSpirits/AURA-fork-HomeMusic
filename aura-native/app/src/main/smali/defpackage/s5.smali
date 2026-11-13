.class public final synthetic Ldefpackage/s5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/w92;


# instance fields
.field public final synthetic n:Ldefpackage/j70;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ldefpackage/p5;

.field public final synthetic q:Ldefpackage/su3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/j70;Ljava/lang/String;Ldefpackage/p5;Ldefpackage/su3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/s5;->n:Ldefpackage/j70;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/s5;->o:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/s5;->p:Ldefpackage/p5;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/s5;->q:Ldefpackage/su3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ldefpackage/ba2;Ldefpackage/q92;)V
    .locals 4

    .line 1
    iget-object p1, p0, Ldefpackage/s5;->n:Ldefpackage/j70;

    .line 2
    .line 3
    iget-object v0, p1, Ldefpackage/j70;->e:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, Ldefpackage/q92;->ON_START:Ldefpackage/q92;

    .line 6
    .line 7
    iget-object v2, p0, Ldefpackage/s5;->o:Ljava/lang/String;

    .line 8
    .line 9
    if-ne v1, p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p1, Ldefpackage/j70;->g:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object p1, p1, Ldefpackage/j70;->f:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v1, Ldefpackage/u5;

    .line 16
    .line 17
    iget-object v3, p0, Ldefpackage/s5;->p:Ldefpackage/p5;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/s5;->q:Ldefpackage/su3;

    .line 20
    .line 21
    invoke-direct {v1, v3, p0}, Ldefpackage/u5;-><init>(Ldefpackage/p5;Ldefpackage/su3;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-interface {v3, v0}, Ldefpackage/p5;->i(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {v2, p2}, Ldefpackage/hw;->l(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ldefpackage/o5;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget p2, p1, Ldefpackage/o5;->n:I

    .line 55
    .line 56
    iget-object p1, p1, Ldefpackage/o5;->o:Landroid/content/Intent;

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Ldefpackage/su3;->B(Landroid/content/Intent;I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {v3, p0}, Ldefpackage/p5;->i(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    sget-object p0, Ldefpackage/q92;->ON_STOP:Ldefpackage/q92;

    .line 67
    .line 68
    if-ne p0, p2, :cond_2

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    sget-object p0, Ldefpackage/q92;->ON_DESTROY:Ldefpackage/q92;

    .line 75
    .line 76
    if-ne p0, p2, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Ldefpackage/j70;->e(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
.end method
