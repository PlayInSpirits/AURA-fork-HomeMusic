.class public final Leu2;
.super Lrp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final b:Lkn2;

.field public c:[I


# direct methods
.method public constructor <init>(Lkn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leu2;->b:Lkn2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Lgc;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lgc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/app/Notification$Builder;

    .line 4
    .line 5
    new-instance v0, Landroid/app/Notification$MediaStyle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/app/Notification$MediaStyle;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Leu2;->b:Lkn2;

    .line 11
    .line 12
    iget-object v2, v1, Lkn2;->a:Ltn2;

    .line 13
    .line 14
    iget-object v2, v2, Ltn2;->h:Lls2;

    .line 15
    .line 16
    iget-object v2, v2, Lls2;->m:Lqr2;

    .line 17
    .line 18
    iget-object v2, v2, Lqr2;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lkr2;

    .line 21
    .line 22
    iget-object v2, v2, Lkr2;->c:Lpr2;

    .line 23
    .line 24
    iget-object v2, v2, Lpr2;->o:Landroid/media/session/MediaSession$Token;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/app/Notification$MediaStyle;->setMediaSession(Landroid/media/session/MediaSession$Token;)Landroid/app/Notification$MediaStyle;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object p0, p0, Leu2;->c:[I

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Landroid/app/Notification$MediaStyle;->setShowActionsInCompactView([I)Landroid/app/Notification$MediaStyle;

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 38
    .line 39
    .line 40
    new-instance p0, Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v0, v1, Lkn2;->a:Ltn2;

    .line 46
    .line 47
    iget-object v0, v0, Ltn2;->j:Lcb4;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcb4;->b()Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "androidx.media3.session"

    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/app/Notification$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 59
    .line 60
    .line 61
    return-void
.end method
