.class public abstract Ldefpackage/qx3;
.super Ldefpackage/bz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qx3;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/l32;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ldefpackage/l32;->e0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ldefpackage/l32;->a0()V

    .line 11
    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qx3;->c()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-virtual {p1}, Ldefpackage/l32;->f()V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p1}, Ldefpackage/l32;->J()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Ldefpackage/l32;->Y()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v3, p0, Ldefpackage/qx3;->a:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ldefpackage/px3;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-boolean v3, v1, Ldefpackage/px3;->e:Z

    .line 42
    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/qx3;->e(Ljava/lang/Object;Ldefpackage/l32;Ldefpackage/px3;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p0

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ldefpackage/l32;->k0()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {p1}, Ldefpackage/l32;->s()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ldefpackage/qx3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :goto_2
    sget-object p1, Ldefpackage/ox3;->a:Ldefpackage/hw;

    .line 65
    .line 66
    const-string p1, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 67
    .line 68
    invoke-static {p1, p0}, Ldefpackage/nz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :catch_1
    move-exception p0

    .line 73
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 74
    .line 75
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method

.method public final b(Ldefpackage/q32;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ldefpackage/q32;->j()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object p0, p0, Ldefpackage/qx3;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ldefpackage/px3;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Ldefpackage/px3;->a(Ldefpackage/q32;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p1}, Ldefpackage/q32;->s()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    sget-object p1, Ldefpackage/ox3;->a:Ldefpackage/hw;

    .line 42
    .line 43
    const-string p1, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 44
    .line 45
    invoke-static {p1, p0}, Ldefpackage/nz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public abstract c()Ljava/lang/Object;
.end method

.method public abstract d(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;Ldefpackage/l32;Ldefpackage/px3;)V
.end method
