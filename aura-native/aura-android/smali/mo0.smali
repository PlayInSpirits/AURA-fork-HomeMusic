.class public final Lmo0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa4;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:Lwf1;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILwf1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmo0;->a:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput p2, p0, Lmo0;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Lmo0;->c:Lwf1;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Llo0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llo0;-><init>(Lmo0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
