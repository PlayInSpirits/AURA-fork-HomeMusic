.class public final Lkv;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lkv;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lkv;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lkv;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p0, p0, Lkv;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lhp4;

    .line 11
    .line 12
    iget-object v0, p0, Lhp4;->p:Lcz;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcz;->r(Ljava/lang/Throwable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lhp4;->p:Lcz;

    .line 21
    .line 22
    sget-object p0, Lj15;->a:Lj15;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 26
    .line 27
    iget-object p0, p0, Lkv;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lcz;

    .line 30
    .line 31
    sget-object p1, Lj15;->a:Lj15;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_1
    check-cast p1, Lgh4;

    .line 38
    .line 39
    sget-object v0, Ljh4;->c:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_0
    sget-wide v1, Ljh4;->e:J

    .line 43
    .line 44
    const-wide/16 v3, 0x1

    .line 45
    .line 46
    add-long/2addr v3, v1

    .line 47
    sput-wide v3, Ljh4;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    iget-object p0, p0, Lkv;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lif1;

    .line 53
    .line 54
    new-instance v0, Luu3;

    .line 55
    .line 56
    invoke-direct {v0, v1, v2, p1, p0}, Luu3;-><init>(JLgh4;Lif1;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    monitor-exit v0

    .line 62
    throw p0

    .line 63
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 64
    .line 65
    iget-object p0, p0, Lkv;->o:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lez;

    .line 68
    .line 69
    invoke-interface {p0}, Lez;->cancel()V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lj15;->a:Lj15;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
