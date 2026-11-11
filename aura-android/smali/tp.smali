.class public final synthetic Ltp;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ltp;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ltp;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ltp;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ltp;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lgf1;

    .line 10
    .line 11
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 12
    .line 13
    invoke-interface {p0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p0, Lrv1;

    .line 19
    .line 20
    iget-object p0, p0, Lrv1;->a:Landroidx/work/impl/WorkDatabase;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->w()Lgp3;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "next_alarm_manager_id"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lgp3;->l(Ljava/lang/String;)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    long-to-int v0, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v1

    .line 41
    :goto_0
    const v3, 0x7fffffff

    .line 42
    .line 43
    .line 44
    if-ne v0, v3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 48
    .line 49
    :goto_1
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->w()Lgp3;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v3, Lfp3;

    .line 54
    .line 55
    int-to-long v4, v1

    .line 56
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {v3, v2, v1}, Lfp3;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3}, Lgp3;->n(Lfp3;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_1
    check-cast p0, Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance v0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :cond_2
    :goto_2
    if-ge v1, v2, :cond_4

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    check-cast v3, Lkd3;

    .line 91
    .line 92
    iget-object v4, v3, Lkd3;->n:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    iget-object v3, v3, Lkd3;->o:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast v3, Lgn2;

    .line 106
    .line 107
    invoke-static {v3}, Lgi1;->J(Lgn2;)Lgn2;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object v6, v5, Lgn2;->f:Lcn2;

    .line 112
    .line 113
    iget-object v6, v6, Lcn2;->a:Landroid/net/Uri;

    .line 114
    .line 115
    iget-object v3, v3, Lgn2;->f:Lcn2;

    .line 116
    .line 117
    iget-object v3, v3, Lcn2;->a:Landroid/net/Uri;

    .line 118
    .line 119
    invoke-static {v6, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-nez v3, :cond_3

    .line 124
    .line 125
    new-instance v3, Lkd3;

    .line 126
    .line 127
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-direct {v3, v4, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    const/4 v3, 0x0

    .line 136
    :goto_3
    if-eqz v3, :cond_2

    .line 137
    .line 138
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    return-object v0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
