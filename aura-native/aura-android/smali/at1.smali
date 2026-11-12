.class public final synthetic Lat1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lqi3;


# direct methods
.method public synthetic constructor <init>(Lqi3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lat1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lat1;->o:Lqi3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lat1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lat1;->o:Lqi3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-interface {p0, v0}, Lqi3;->R(F)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/a;->g(Lqi3;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-interface {p0, v0}, Lqi3;->s(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lud3;->y0(Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
