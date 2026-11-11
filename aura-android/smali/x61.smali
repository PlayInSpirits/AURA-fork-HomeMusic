.class public final Lx61;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvw2;


# instance fields
.field public final a:Ly41;


# direct methods
.method public constructor <init>(Ly41;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx61;->a:Ly41;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lna4;)Luw2;
    .locals 1

    .line 1
    new-instance p1, Lmw;

    .line 2
    .line 3
    iget-object p0, p0, Lx61;->a:Ly41;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-direct {p1, v0, p0}, Lmw;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object p1
.end method
