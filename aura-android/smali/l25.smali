.class public final synthetic Ll25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq25;


# direct methods
.method public synthetic constructor <init>(Lq25;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll25;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ll25;->b:Lq25;

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
    .locals 1

    .line 1
    iget v0, p0, Ll25;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ll25;->b:Lq25;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "on release"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lq25;->a2(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lq25;->l:Lmx2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lmx2;->shutdown()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lj15;->a:Lj15;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    const-string v0, "on stop"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lq25;->a2(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lq25;->r:Z

    .line 28
    .line 29
    invoke-virtual {p0}, Lq25;->c2()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput v0, p0, Lq25;->s:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lq25;->Z1()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lq25;->O1()V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lj15;->a:Lj15;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    invoke-virtual {p0}, Lq25;->X1()V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lj15;->a:Lj15;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    const-string v0, "on an emptied queue"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lq25;->a2(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x4

    .line 56
    iput v0, p0, Lq25;->s:I

    .line 57
    .line 58
    invoke-virtual {p0}, Lq25;->Z1()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lq25;->O1()V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lj15;->a:Lj15;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
