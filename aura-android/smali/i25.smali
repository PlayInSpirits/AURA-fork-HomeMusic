.class public final synthetic Li25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Lq25;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(JLq25;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li25;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Li25;->b:J

    .line 8
    .line 9
    iput-object p3, p0, Li25;->c:Lq25;

    .line 10
    .line 11
    iput-wide p4, p0, Li25;->d:J

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lq25;JJ)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Li25;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li25;->c:Lq25;

    iput-wide p2, p0, Li25;->b:J

    iput-wide p4, p0, Li25;->d:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Li25;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Li25;->b:J

    .line 7
    .line 8
    iget-object v2, p0, Li25;->c:Lq25;

    .line 9
    .line 10
    iget-wide v3, p0, Li25;->d:J

    .line 11
    .line 12
    :try_start_0
    iget-wide v5, v2, Lq25;->E:J

    .line 13
    .line 14
    cmp-long p0, v0, v5

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2, v3, v4}, Lq25;->P1(J)V

    .line 19
    .line 20
    .line 21
    iput-wide v0, v2, Lq25;->F:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    iget-object p0, v2, Lq25;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 29
    .line 30
    .line 31
    sget-object p0, Lj15;->a:Lj15;

    .line 32
    .line 33
    return-object p0

    .line 34
    :goto_1
    iget-object v0, v2, Lq25;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :pswitch_0
    iget-object v0, p0, Li25;->c:Lq25;

    .line 41
    .line 42
    iget-wide v1, p0, Li25;->b:J

    .line 43
    .line 44
    iget-wide v3, p0, Li25;->d:J

    .line 45
    .line 46
    iget-boolean p0, v0, Lq25;->r:Z

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    iget-boolean p0, v0, Lq25;->J:Z

    .line 51
    .line 52
    if-nez p0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Lq25;->V1(J)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-boolean p0, v0, Lq25;->r:Z

    .line 60
    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    iput-object p0, v0, Lq25;->H:Ljava/lang/Long;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lq25;->W1(J)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iput-object p0, v0, Lq25;->H:Ljava/lang/Long;

    .line 76
    .line 77
    const/4 p0, 0x1

    .line 78
    :goto_2
    if-eqz p0, :cond_3

    .line 79
    .line 80
    iget-wide v5, v0, Lq25;->E:J

    .line 81
    .line 82
    cmp-long p0, v3, v5

    .line 83
    .line 84
    if-nez p0, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Lq25;->Y1(J)V

    .line 87
    .line 88
    .line 89
    iput-wide v1, v0, Lq25;->A:J

    .line 90
    .line 91
    :cond_3
    iput-wide v3, v0, Lq25;->F:J

    .line 92
    .line 93
    invoke-virtual {v0}, Lq25;->O1()V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lj15;->a:Lj15;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
