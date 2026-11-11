.class public final synthetic Le25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le25;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Le25;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Le25;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    iget-object p0, p0, Le25;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lsc5;

    .line 11
    .line 12
    iget-object v0, p0, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 13
    .line 14
    iget-object v2, p0, Lsc5;->a:Landroid/content/Context;

    .line 15
    .line 16
    sget-object v3, Ldq4;->s:Ljava/lang/String;

    .line 17
    .line 18
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v4, 0x22

    .line 21
    .line 22
    if-lt v3, v4, :cond_0

    .line 23
    .line 24
    invoke-static {v2}, Lw22;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Landroid/app/job/JobScheduler;->cancelAll()V

    .line 29
    .line 30
    .line 31
    :cond_0
    const-string v3, "jobscheduler"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Landroid/app/job/JobScheduler;

    .line 38
    .line 39
    invoke-static {v2, v3}, Ldq4;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/4 v5, 0x0

    .line 56
    :goto_0
    if-ge v5, v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    check-cast v6, Landroid/app/job/JobInfo;

    .line 65
    .line 66
    invoke-virtual {v6}, Landroid/app/job/JobInfo;->getId()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v3, v6}, Ldq4;->a(Landroid/app/job/JobScheduler;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v3, v2, Lfd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 79
    .line 80
    invoke-virtual {v3}, Ls24;->b()V

    .line 81
    .line 82
    .line 83
    iget-object v2, v2, Lfd5;->m:Laq4;

    .line 84
    .line 85
    invoke-virtual {v2}, Lrx1;->a()Ldf1;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :try_start_0
    invoke-virtual {v3}, Ls24;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :try_start_1
    invoke-virtual {v4}, Ldf1;->b()I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ls24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    .line 97
    .line 98
    :try_start_2
    invoke-virtual {v3}, Ls24;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Lrx1;->h(Ldf1;)V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, Lsc5;->b:Lr90;

    .line 105
    .line 106
    iget-object p0, p0, Lsc5;->e:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v2, v0, p0}, Lc64;->b(Lr90;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_1

    .line 114
    :catchall_1
    move-exception p0

    .line 115
    :try_start_3
    invoke-virtual {v3}, Ls24;->o()V

    .line 116
    .line 117
    .line 118
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    :goto_1
    invoke-virtual {v2, v4}, Lrx1;->h(Ldf1;)V

    .line 120
    .line 121
    .line 122
    throw p0

    .line 123
    :pswitch_0
    check-cast p0, Lmc5;

    .line 124
    .line 125
    invoke-static {p0}, Lp11;->a(Lmc5;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :pswitch_1
    check-cast p0, Ljx3;

    .line 130
    .line 131
    iget-object p0, p0, Ljx3;->n:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lgf1;

    .line 134
    .line 135
    invoke-interface {p0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :pswitch_2
    check-cast p0, Le45;

    .line 140
    .line 141
    iget-object p0, p0, Le45;->h:Lzd3;

    .line 142
    .line 143
    invoke-virtual {p0, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :pswitch_3
    check-cast p0, Lf25;

    .line 148
    .line 149
    iget-object p0, p0, Lf25;->a:Lo83;

    .line 150
    .line 151
    invoke-virtual {p0}, Lo83;->a()Ln83;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    const-wide/16 v0, 0x1

    .line 156
    .line 157
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 158
    .line 159
    invoke-virtual {p0, v0, v1, v2}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 160
    .line 161
    .line 162
    const-wide/16 v0, 0x3

    .line 163
    .line 164
    invoke-static {v0, v1, v2}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iput v0, p0, Ln83;->x:I

    .line 169
    .line 170
    new-instance v0, Lo83;

    .line 171
    .line 172
    invoke-direct {v0, p0}, Lo83;-><init>(Ln83;)V

    .line 173
    .line 174
    .line 175
    return-object v0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
