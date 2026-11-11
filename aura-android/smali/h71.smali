.class public final Lh71;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa4;


# instance fields
.field public final a:Laa4;

.field public final b:Z

.field public final c:Lif1;


# direct methods
.method public constructor <init>(Laa4;ZLif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh71;->a:Laa4;

    .line 5
    .line 6
    iput-boolean p2, p0, Lh71;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lh71;->c:Lif1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lg71;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg71;-><init>(Lh71;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
