.class public final Lcj1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Lcj1;


# instance fields
.field public final a:Lpa;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lpa;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lcj1;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, Lcj1;-><init>(Lpa;Landroid/os/Looper;)V

    .line 14
    .line 15
    .line 16
    sput-object v2, Lcj1;->c:Lcj1;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lpa;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcj1;->a:Lpa;

    .line 5
    .line 6
    iput-object p2, p0, Lcj1;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-void
.end method
