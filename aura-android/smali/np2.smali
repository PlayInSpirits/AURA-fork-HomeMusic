.class public final Lnp2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldg;


# direct methods
.method public constructor <init>(Ldg;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnp2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lnp2;->b:Ldg;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p1, Luk2;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Luk2;-><init>(Lnp2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final binderDied()V
    .locals 0

    .line 1
    return-void
.end method
