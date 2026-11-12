.class public final synthetic Lrt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lrt1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrt1;->o:Ljava/lang/Object;

    iput-object p2, p0, Lrt1;->p:Ljava/lang/Object;

    iput-object p3, p0, Lrt1;->q:Ljava/lang/Object;

    iput-object p4, p0, Lrt1;->r:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lgf1;Ldx2;Lq82;Lpc3;I)V
    .locals 0

    .line 1
    const/4 p5, 0x1

    .line 2
    iput p5, p0, Lrt1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrt1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lrt1;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lrt1;->q:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lrt1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lrt1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lrt1;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lrt1;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lrt1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lrt1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v4, p0

    .line 15
    check-cast v4, Lgf1;

    .line 16
    .line 17
    move-object v5, v3

    .line 18
    check-cast v5, Ldx2;

    .line 19
    .line 20
    move-object v6, v2

    .line 21
    check-cast v6, Lq82;

    .line 22
    .line 23
    move-object v7, v1

    .line 24
    check-cast v7, Lpc3;

    .line 25
    .line 26
    move-object v8, p1

    .line 27
    check-cast v8, Lrg1;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    invoke-static {p0}, Lxl;->O(I)I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    invoke-static/range {v4 .. v9}, Lsu3;->b(Lgf1;Ldx2;Lq82;Lpc3;Lrg1;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lj15;->a:Lj15;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p0, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 46
    .line 47
    check-cast v3, Landroid/widget/TextView;

    .line 48
    .line 49
    move-object v6, v2

    .line 50
    check-cast v6, Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 51
    .line 52
    move-object v7, v1

    .line 53
    check-cast v7, Landroid/app/Activity;

    .line 54
    .line 55
    check-cast p1, Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    check-cast p2, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    move-object v2, p0

    .line 68
    invoke-static/range {v0 .. v7}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->b(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)Lj15;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
