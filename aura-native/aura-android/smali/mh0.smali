.class public final Lmh0;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:Llw4;

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Z

.field public final synthetic s:Ls24;

.field public final synthetic t:Lif1;


# direct methods
.method public constructor <init>(Lvd0;Lif1;Ls24;Z)V
    .locals 0

    .line 1
    iput-boolean p4, p0, Lmh0;->r:Z

    .line 2
    .line 3
    iput-object p3, p0, Lmh0;->s:Ls24;

    .line 4
    .line 5
    iput-object p2, p0, Lmh0;->t:Lif1;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Lep4;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 3

    .line 1
    new-instance v0, Lmh0;

    .line 2
    .line 3
    iget-object v1, p0, Lmh0;->s:Ls24;

    .line 4
    .line 5
    iget-object v2, p0, Lmh0;->t:Lif1;

    .line 6
    .line 7
    iget-boolean p0, p0, Lmh0;->r:Z

    .line 8
    .line 9
    invoke-direct {v0, p2, v2, v1, p0}, Lmh0;-><init>(Lvd0;Lif1;Ls24;Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lmh0;->q:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lmw4;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lmh0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lmh0;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lmh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lmh0;->p:I

    .line 2
    .line 3
    iget-object v1, p0, Lmh0;->t:Lif1;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v3, p0, Lmh0;->s:Ls24;

    .line 9
    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    sget-object v8, Lxe0;->n:Lxe0;

    .line 15
    .line 16
    if-eq v0, v7, :cond_3

    .line 17
    .line 18
    if-eq v0, v6, :cond_2

    .line 19
    .line 20
    if-eq v0, v5, :cond_1

    .line 21
    .line 22
    if-ne v0, v4, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lmh0;->q:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    iget-object v0, p0, Lmh0;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lmw4;

    .line 40
    .line 41
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object v0, p0, Lmh0;->o:Llw4;

    .line 46
    .line 47
    iget-object v6, p0, Lmh0;->q:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, Lmw4;

    .line 50
    .line 51
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-object v0, p0, Lmh0;->o:Llw4;

    .line 56
    .line 57
    iget-object v9, p0, Lmh0;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Lmw4;

    .line 60
    .line 61
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_5

    .line 71
    .line 72
    invoke-virtual {v3}, Ls24;->i()Ls12;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object v9, p0, Lmh0;->q:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v0, p0, Lmh0;->o:Llw4;

    .line 79
    .line 80
    iput v6, p0, Lmh0;->p:I

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Ls12;->b(Lep4;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v8, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v6, v9

    .line 90
    :goto_0
    move-object p1, v0

    .line 91
    move-object v0, v6

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    move-object p1, v0

    .line 94
    move-object v0, v9

    .line 95
    :goto_1
    new-instance v6, Lhh0;

    .line 96
    .line 97
    invoke-direct {v6, v2, v1, v7}, Lhh0;-><init>(Lvd0;Lif1;I)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lmh0;->q:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v2, p0, Lmh0;->o:Llw4;

    .line 103
    .line 104
    iput v5, p0, Lmh0;->p:I

    .line 105
    .line 106
    invoke-interface {v0, p1, v6, p0}, Lmw4;->a(Llw4;Lwf1;Lep4;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v8, :cond_6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    :goto_2
    iget-boolean v1, p0, Lmh0;->r:Z

    .line 114
    .line 115
    if-nez v1, :cond_9

    .line 116
    .line 117
    iput-object p1, p0, Lmh0;->q:Ljava/lang/Object;

    .line 118
    .line 119
    iput v4, p0, Lmh0;->p:I

    .line 120
    .line 121
    invoke-interface {v0, p0}, Lmw4;->d(Lep4;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-ne p0, v8, :cond_7

    .line 126
    .line 127
    :goto_3
    return-object v8

    .line 128
    :cond_7
    move-object v10, p1

    .line 129
    move-object p1, p0

    .line 130
    move-object p0, v10

    .line 131
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-nez p1, :cond_8

    .line 138
    .line 139
    invoke-virtual {v3}, Ls24;->i()Ls12;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object v0, p1, Ls12;->b:Ljy4;

    .line 144
    .line 145
    iget-object v1, p1, Ls12;->e:Le90;

    .line 146
    .line 147
    iget-object p1, p1, Ls12;->f:Le90;

    .line 148
    .line 149
    invoke-virtual {v0, v1, p1}, Ljy4;->e(Lgf1;Lgf1;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    return-object p0

    .line 153
    :cond_9
    return-object p1

    .line 154
    :cond_a
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object p0, p0, Lmh0;->q:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Lmw4;

    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    check-cast p0, Lqu3;

    .line 165
    .line 166
    invoke-interface {p0}, Lqu3;->c()Lx34;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-interface {v1, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0
.end method
