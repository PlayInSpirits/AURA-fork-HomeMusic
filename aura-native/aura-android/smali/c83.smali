.class public final Lc83;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvb3;


# static fields
.field public static final o:Lk52;


# instance fields
.field public final n:Lb83;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk52;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc83;->o:Lk52;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lb83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc83;->n:Lb83;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc83;->n:Lb83;

    .line 2
    .line 3
    check-cast p0, Lcx2;

    .line 4
    .line 5
    iget-object p0, p0, Lcx2;->n:Lcx2;

    .line 6
    .line 7
    iget-boolean p0, p0, Lcx2;->A:Z

    .line 8
    .line 9
    return p0
.end method
