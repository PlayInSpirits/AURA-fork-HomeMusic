.class public abstract Ldefpackage/c0;
.super Ldefpackage/a32;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/vd0;
.implements Ldefpackage/we0;


# instance fields
.field public final r:Ldefpackage/ne0;


# direct methods
.method public constructor <init>(Ldefpackage/ne0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ldefpackage/a32;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Ldefpackage/s22;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Ldefpackage/a32;->N(Ldefpackage/s22;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ldefpackage/c0;->r:Ldefpackage/ne0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final L(Lkotlinx/coroutines/CompletionHandlerException;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c0;->r:Ldefpackage/ne0;

    .line 2
    .line 3
    invoke-static {p0, p1}, Ldefpackage/uc5;->s(Ldefpackage/ne0;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final X(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ldefpackage/a70;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ldefpackage/a70;

    .line 6
    .line 7
    iget-object v0, p1, Ldefpackage/a70;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    sget-object v1, Ldefpackage/a70;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0, v0, p1}, Ldefpackage/c0;->j0(Ljava/lang/Throwable;Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/c0;->k0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final e()Ldefpackage/ne0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c0;->r:Ldefpackage/ne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContext()Ldefpackage/ne0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/c0;->r:Ldefpackage/ne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public j0(Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public k0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l0(Ldefpackage/ze0;Ldefpackage/c0;Ldefpackage/wf1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p1, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    :try_start_0
    iget-object p1, p0, Ldefpackage/c0;->r:Ldefpackage/ne0;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Ldefpackage/te5;->R(Ldefpackage/ne0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    instance-of v2, p3, Ldefpackage/jp;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-static {p3, p2, p0}, Ldefpackage/ya4;->Q(Ldefpackage/wf1;Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-static {v1, p3}, Ldefpackage/jz4;->j(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, p2, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :goto_0
    :try_start_2
    invoke-static {p1, v0}, Ldefpackage/te5;->K(Ldefpackage/ne0;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    .line 45
    .line 46
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 47
    .line 48
    if-eq p2, p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Ldefpackage/c0;->resumeWith(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :goto_1
    :try_start_3
    invoke-static {p1, v0}, Ldefpackage/te5;->K(Ldefpackage/ne0;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 60
    :goto_2
    new-instance p2, Ldefpackage/s14;

    .line 61
    .line 62
    invoke-direct {p2, p1}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p2}, Ldefpackage/c0;->resumeWith(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p2, p0, p3}, Ldefpackage/ya4;->i(Ldefpackage/vd0;Ldefpackage/vd0;Ldefpackage/wf1;)Ldefpackage/vd0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p0, v0}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    return-void

    .line 88
    :cond_4
    :try_start_4
    invoke-static {p2, p0, p3}, Ldefpackage/ya4;->i(Ldefpackage/vd0;Ldefpackage/vd0;Ldefpackage/wf1;)Ldefpackage/vd0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1, v0}, Ldefpackage/uc5;->T(Ldefpackage/vd0;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catchall_2
    move-exception p1

    .line 101
    new-instance p2, Ldefpackage/s14;

    .line 102
    .line 103
    invoke-direct {p2, p1}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p2}, Ldefpackage/c0;->resumeWith(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ldefpackage/a70;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Ldefpackage/a70;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Ldefpackage/a32;->S(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Ldefpackage/zz1;->e:Ldefpackage/f01;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/c0;->m(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
