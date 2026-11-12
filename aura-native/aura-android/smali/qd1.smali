.class public final synthetic Lqd1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxd1;


# instance fields
.field public final synthetic n:Ld23;

.field public final synthetic o:Lrd1;


# direct methods
.method public synthetic constructor <init>(Ld23;Lrd1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd1;->n:Ld23;

    .line 5
    .line 6
    iput-object p2, p0, Lqd1;->o:Lrd1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lld1;Lkc1;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lqd1;->n:Ld23;

    .line 8
    .line 9
    iget-object v0, p1, Ld23;->e:Lvu3;

    .line 10
    .line 11
    iget-object v0, v0, Lvu3;->n:Lnl4;

    .line 12
    .line 13
    invoke-virtual {v0}, Lnl4;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, La23;

    .line 39
    .line 40
    iget-object v2, v2, La23;->s:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p2, Lkc1;->L:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :goto_0
    check-cast v1, La23;

    .line 53
    .line 54
    invoke-static {}, Lrd1;->n()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object p0, p0, Lqd1;->o:Lrd1;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "Attaching fragment "

    .line 65
    .line 66
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, " associated with entry "

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, " to FragmentManager "

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lrd1;->d:Lld1;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v2, "FragmentNavigator"

    .line 95
    .line 96
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    :cond_2
    if-eqz v1, :cond_3

    .line 100
    .line 101
    iget-object v0, p2, Lkc1;->e0:Lk03;

    .line 102
    .line 103
    new-instance v2, Lud1;

    .line 104
    .line 105
    invoke-direct {v2, p0, p2, v1}, Lud1;-><init>(Lrd1;Lkc1;La23;)V

    .line 106
    .line 107
    .line 108
    new-instance v3, Lwd1;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-direct {v3, v2, v4}, Lwd1;-><init>(Lif1;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p2, v3}, Lad2;->e(Lba2;La83;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p2, Lkc1;->c0:Lea2;

    .line 118
    .line 119
    iget-object v2, p0, Lrd1;->h:Lpd1;

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Lea2;->a(Laa2;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p2, v1, p1}, Lrd1;->l(Lkc1;La23;Ld23;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    return-void
.end method
