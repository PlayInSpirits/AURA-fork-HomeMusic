.class public final Lj52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lj52;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lj52;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Lqi3;Lni3;)V
    .locals 5

    .line 1
    iget v0, p0, Lj52;->n:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lj52;->o:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lw12;

    .line 12
    .line 13
    iget-object p1, p0, Lw12;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lzm4;

    .line 16
    .line 17
    invoke-virtual {p1}, Lzm4;->a()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lw12;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lan4;

    .line 23
    .line 24
    invoke-virtual {p1}, Lan4;->a()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lw12;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lbn4;

    .line 30
    .line 31
    invoke-virtual {p1}, Lbn4;->a()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lw12;->k:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lcn4;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcn4;->a()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p2, p2, Lni3;->a:Lw71;

    .line 46
    .line 47
    iget-object v0, p2, Lw71;->a:Landroid/util/SparseBooleanArray;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    sput-boolean v3, Lis3;->d:Z

    .line 56
    .line 57
    :cond_0
    const/16 v0, 0x8

    .line 58
    .line 59
    const/16 v4, 0x9

    .line 60
    .line 61
    filled-new-array {v3, v2, v1, v0, v4}, [I

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p2, v0}, Lw71;->a([I)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    check-cast p0, Lcom/eddyizm/tempus/service/MediaService;

    .line 72
    .line 73
    invoke-static {p1, p0}, Lis3;->a(Lqi3;Lao2;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :pswitch_1
    iget-object p2, p2, Lni3;->a:Lw71;

    .line 78
    .line 79
    iget-object v0, p2, Lw71;->a:Landroid/util/SparseBooleanArray;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    const/4 v0, 0x5

    .line 88
    iget-object v4, p2, Lw71;->a:Landroid/util/SparseBooleanArray;

    .line 89
    .line 90
    invoke-virtual {v4, v0}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    iget-object p2, p2, Lw71;->a:Landroid/util/SparseBooleanArray;

    .line 97
    .line 98
    invoke-virtual {p2, v1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_5

    .line 103
    .line 104
    :cond_2
    invoke-interface {p1}, Lqi3;->a()Lgn2;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-eqz p2, :cond_3

    .line 109
    .line 110
    invoke-interface {p1}, Lqi3;->a()Lgn2;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iget-object p2, p2, Lgn2;->a:Ljava/lang/String;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    const/4 p2, 0x0

    .line 118
    :goto_0
    invoke-interface {p1}, Lqi3;->g()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/4 v1, 0x3

    .line 123
    if-ne v0, v1, :cond_4

    .line 124
    .line 125
    invoke-interface {p1}, Lqi3;->q()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_4

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move v2, v3

    .line 133
    :goto_1
    check-cast p0, Lom1;

    .line 134
    .line 135
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Lli3;

    .line 138
    .line 139
    invoke-virtual {p0, p2, v2}, Lli3;->c(Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    :cond_5
    return-void

    .line 143
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast p0, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 147
    .line 148
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
