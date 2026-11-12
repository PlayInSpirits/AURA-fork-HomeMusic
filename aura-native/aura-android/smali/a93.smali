.class public final La93;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lrp4;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La93;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lwc;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    invoke-direct {p1, v0, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lrp4;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lrp4;-><init>(Lgf1;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La93;->b:Lrp4;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lba2;Lv83;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lba2;->h()Lea2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, Lea2;->h:Lr92;

    .line 12
    .line 13
    sget-object v2, Lr92;->n:Lr92;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, Lw83;

    .line 19
    .line 20
    invoke-direct {v1, p1, p2}, Lw83;-><init>(Lba2;Lv83;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lu83;

    .line 24
    .line 25
    invoke-direct {p1, p2, v1}, Lu83;-><init>(Lv83;Lw83;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p2, Lv83;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p1, v1}, Lu83;->b(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La93;->b()Ly83;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, Ly83;->c:Lbq4;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v2, v1, Lbq4;->p:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v2, v1, Lbq4;->o:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lw33;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v3, p1, Lu83;->c:Lbq4;

    .line 64
    .line 65
    if-nez v3, :cond_1

    .line 66
    .line 67
    iget-object v3, v2, Lw33;->e:Lii;

    .line 68
    .line 69
    invoke-virtual {v3, p1}, Lii;->addFirst(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p1, Lu83;->c:Lbq4;

    .line 73
    .line 74
    invoke-virtual {v2}, Lw33;->b()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const-string p0, "Handler \'"

    .line 79
    .line 80
    const-string p2, "\' is already registered with a dispatcher"

    .line 81
    .line 82
    invoke-static {p1, p2, p0}, Lnz2;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    :goto_0
    new-instance v1, Ltl0;

    .line 87
    .line 88
    invoke-direct {v1, p1, p0, v0}, Ltl0;-><init>(Lu83;La93;Lea2;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lea2;->a(Laa2;)V

    .line 92
    .line 93
    .line 94
    new-instance p0, Lx83;

    .line 95
    .line 96
    invoke-direct {p0, v0, v1}, Lx83;-><init>(Lea2;Ltl0;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p2, Lv83;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final b()Ly83;
    .locals 0

    .line 1
    iget-object p0, p0, La93;->b:Lrp4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ly83;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La93;->b()Ly83;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ly83;->c:Lbq4;

    .line 6
    .line 7
    new-instance v1, Ls83;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, v2}, Ls83;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v1, v3}, Lbq4;->f(Ls83;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La93;->b()Ly83;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, Ly83;->c:Lbq4;

    .line 22
    .line 23
    new-instance v0, Ls83;

    .line 24
    .line 25
    const v1, 0xf4240

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, Ls83;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v2}, Lbq4;->f(Ls83;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
