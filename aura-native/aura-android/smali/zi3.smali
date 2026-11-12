.class public final Lzi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/StarCallback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic p:Laj3;


# direct methods
.method public synthetic constructor <init>(Laj3;Lcom/eddyizm/tempus/subsonic/models/Child;I)V
    .locals 0

    .line 1
    iput p3, p0, Lzi3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lzi3;->p:Laj3;

    .line 4
    .line 5
    iput-object p2, p0, Lzi3;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

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
    iget v0, p0, Lzi3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lzi3;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 5
    .line 6
    iget-object p0, p0, Lzi3;->p:Laj3;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Laj3;->g:Ld34;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p0, v0, v1, v2, v1}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Laj3;->g:Ld34;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p0, v0, v1, v2, v1}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
