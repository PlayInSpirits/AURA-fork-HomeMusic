.class public final Lpl;
.super Landroid/database/ContentObserver;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/ContentResolver;

.field public final b:Landroid/net/Uri;

.field public final synthetic c:Lql;


# direct methods
.method public constructor <init>(Lql;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpl;->c:Lql;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, Lpl;->a:Landroid/content/ContentResolver;

    .line 7
    .line 8
    iput-object p4, p0, Lpl;->b:Landroid/net/Uri;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lpl;->c:Lql;

    .line 2
    .line 3
    iget-object p1, p0, Lql;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, p0, Lql;->i:Lil;

    .line 6
    .line 7
    iget-object v1, p0, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lnl;->b(Landroid/content/Context;Lil;Landroid/media/AudioDeviceInfo;)Lnl;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lql;->a(Lnl;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
