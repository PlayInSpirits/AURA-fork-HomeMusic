.class public final La60;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq81;


# instance fields
.field public final synthetic n:Law;

.field public final synthetic o:I


# direct methods
.method public constructor <init>(Law;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La60;->n:Law;

    .line 5
    .line 6
    iput p2, p0, La60;->o:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lz50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz50;

    .line 7
    .line 8
    iget v1, v0, Lz50;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz50;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz50;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz50;-><init>(La60;Lvd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz50;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lz50;->p:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    sget-object v3, Lj15;->a:Lj15;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lxe0;->n:Lxe0;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_6

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p2, Lyx1;

    .line 60
    .line 61
    iget v1, p0, La60;->o:I

    .line 62
    .line 63
    invoke-direct {p2, v1, p1}, Lyx1;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput v5, v0, Lz50;->p:I

    .line 67
    .line 68
    iget-object p0, p0, La60;->n:Law;

    .line 69
    .line 70
    invoke-interface {p0, v0, p2}, Ly94;->a(Lvd0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v6, :cond_4

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_4
    :goto_1
    iput v4, v0, Lz50;->p:I

    .line 78
    .line 79
    invoke-interface {v0}, Lvd0;->getContext()Lne0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lgb;->u(Lne0;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lya4;->x(Lvd0;)Lvd0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    instance-of p2, p1, Lmr0;

    .line 91
    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    move-object v2, p1

    .line 95
    check-cast v2, Lmr0;

    .line 96
    .line 97
    :cond_5
    if-nez v2, :cond_6

    .line 98
    .line 99
    move-object p0, v3

    .line 100
    goto :goto_3

    .line 101
    :cond_6
    iget-object p1, v2, Lmr0;->q:Lpe0;

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Lpe0;->Y(Lne0;)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_7

    .line 108
    .line 109
    iput-object v3, v2, Lmr0;->s:Ljava/lang/Object;

    .line 110
    .line 111
    iput v5, v2, Lor0;->p:I

    .line 112
    .line 113
    invoke-virtual {p1, p0, v2}, Lpe0;->X(Lne0;Ljava/lang/Runnable;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    new-instance p2, Lle5;

    .line 118
    .line 119
    sget-object v0, Lle5;->o:Lz45;

    .line 120
    .line 121
    invoke-direct {p2, v0}, Ld0;-><init>(Lme0;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p0, p2}, Lne0;->J(Lne0;)Lne0;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iput-object v3, v2, Lmr0;->s:Ljava/lang/Object;

    .line 129
    .line 130
    iput v5, v2, Lor0;->p:I

    .line 131
    .line 132
    invoke-virtual {p1, p0, v2}, Lpe0;->X(Lne0;Ljava/lang/Runnable;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    move-object p0, v6

    .line 136
    :goto_3
    if-ne p0, v6, :cond_8

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    move-object p0, v3

    .line 140
    :goto_4
    if-ne p0, v6, :cond_9

    .line 141
    .line 142
    :goto_5
    return-object v6

    .line 143
    :cond_9
    :goto_6
    return-object v3
.end method
