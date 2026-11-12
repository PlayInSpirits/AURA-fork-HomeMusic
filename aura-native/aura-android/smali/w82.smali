.class public final Lw82;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public p:I

.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILvd0;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw82;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Lw82;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lw82;->q:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lep4;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 2

    .line 1
    iget p1, p0, Lw82;->o:I

    .line 2
    .line 3
    iget v0, p0, Lw82;->q:I

    .line 4
    .line 5
    iget-object p0, p0, Lw82;->r:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Lw82;

    .line 11
    .line 12
    check-cast p0, Llm0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, p0, v0, p2, v1}, Lw82;-><init>(Ljava/lang/Object;ILvd0;I)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    new-instance p1, Lw82;

    .line 20
    .line 21
    check-cast p0, Lx82;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, Lw82;-><init>(Ljava/lang/Object;ILvd0;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lw82;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lq64;

    .line 9
    .line 10
    check-cast p2, Lvd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lw82;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lw82;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lw82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lwe0;

    .line 24
    .line 25
    check-cast p2, Lvd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lw82;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lw82;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lw82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lw82;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    iget v2, p0, Lw82;->q:I

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lxe0;->n:Lxe0;

    .line 10
    .line 11
    iget-object v5, p0, Lw82;->r:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v5, Llm0;

    .line 19
    .line 20
    iget v0, p0, Lw82;->p:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Lkf2;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput v7, p0, Lw82;->p:I

    .line 39
    .line 40
    invoke-virtual {v5, p0}, Lad3;->i(Lwd0;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-ne p0, v4, :cond_2

    .line 45
    .line 46
    move-object v1, v4

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    invoke-virtual {v5, v2}, Lad3;->j(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {v5, p1, p0, v7}, Lad3;->t(FIZ)V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-object v1

    .line 57
    :pswitch_0
    iget v0, p0, Lw82;->p:I

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    if-ne v0, v7, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_3
    invoke-static {v3}, Lkf2;->o(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v1, v6

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    check-cast v5, Lx82;

    .line 76
    .line 77
    iget-object p1, v5, Lx82;->C:Ls82;

    .line 78
    .line 79
    iput v7, p0, Lw82;->p:I

    .line 80
    .line 81
    iget-object p1, p1, Ls82;->a:Llm0;

    .line 82
    .line 83
    new-instance v0, Lw82;

    .line 84
    .line 85
    invoke-direct {v0, p1, v2, v6, v7}, Lw82;-><init>(Ljava/lang/Object;ILvd0;I)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lh13;->n:Lh13;

    .line 89
    .line 90
    invoke-static {p1, v2, v0, p0}, Lad3;->s(Lad3;Lh13;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v4, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object p0, v1

    .line 98
    :goto_2
    if-ne p0, v4, :cond_6

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_6
    move-object p0, v1

    .line 102
    :goto_3
    if-ne p0, v4, :cond_7

    .line 103
    .line 104
    move-object v1, v4

    .line 105
    :cond_7
    :goto_4
    return-object v1

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
