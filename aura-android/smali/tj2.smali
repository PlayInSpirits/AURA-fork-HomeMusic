.class public final Ltj2;
.super Lsj2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic t:Lpn2;


# direct methods
.method public constructor <init>(Lpn2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltj2;->t:Lpn2;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lsj2;-><init>(Lpn2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j()Lms2;
    .locals 2

    .line 1
    iget-object v0, p0, Ltj2;->t:Lpn2;

    .line 2
    .line 3
    iget-object v1, v0, Lpn2;->s:Loj2;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lpn2;->p:Loj2;

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lms2;

    .line 12
    .line 13
    iget-object p0, p0, Lbq4;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lqj2;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lsr0;->h(Lqj2;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Lms2;-><init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    iget-object p0, v1, Loj2;->d:Lms2;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    const-string p0, "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"

    .line 32
    .line 33
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method
