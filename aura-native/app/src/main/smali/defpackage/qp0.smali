.class public final synthetic Ldefpackage/qp0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xd1;


# instance fields
.field public final synthetic n:Ldefpackage/tp0;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/tp0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qp0;->n:Ldefpackage/tp0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ld1;Ldefpackage/kc1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/qp0;->n:Ldefpackage/tp0;

    .line 8
    .line 9
    iget-object p1, p0, Ldefpackage/tp0;->e:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    iget-object v0, p2, Ldefpackage/kc1;->L:Ljava/lang/String;

    .line 12
    .line 13
    instance-of v1, p1, Ldefpackage/x32;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    instance-of v1, p1, Ldefpackage/y32;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "kotlin.collections.MutableCollection"

    .line 23
    .line 24
    invoke-static {p1, p0}, Ldefpackage/jz4;->M(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    invoke-interface {p1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p2, Ldefpackage/kc1;->c0:Ldefpackage/ea2;

    .line 36
    .line 37
    iget-object v0, p0, Ldefpackage/tp0;->f:Ldefpackage/vv3;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ldefpackage/ea2;->a(Ldefpackage/aa2;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object p0, p0, Ldefpackage/tp0;->g:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    iget-object p1, p2, Ldefpackage/kc1;->L:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p0}, Ldefpackage/jz4;->f(Ljava/lang/Object;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-void
.end method
