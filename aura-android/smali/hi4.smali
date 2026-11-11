.class public final Lhi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/StarCallback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic p:Lii4;


# direct methods
.method public synthetic constructor <init>(Lii4;Lcom/eddyizm/tempus/subsonic/models/Child;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhi4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lhi4;->p:Lii4;

    .line 4
    .line 5
    iput-object p2, p0, Lhi4;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onError()V
    .locals 3

    .line 1
    iget v0, p0, Lhi4;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhi4;->p:Lii4;

    .line 7
    .line 8
    iget-object v0, v0, Lii4;->f:Ld34;

    .line 9
    .line 10
    iget-object p0, p0, Lhi4;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, p0, v1, v2, v1}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lhi4;->p:Lii4;

    .line 23
    .line 24
    iget-object v0, v0, Lii4;->f:Ld34;

    .line 25
    .line 26
    iget-object p0, p0, Lhi4;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v0, p0, v1, v2, v1}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
