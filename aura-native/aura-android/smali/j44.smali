.class public final Lj44;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr51;


# instance fields
.field public final n:Ljava/security/MessageDigest;

.field public final o:Lul4;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lul4;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj44;->o:Lul4;

    .line 10
    .line 11
    iput-object p1, p0, Lj44;->n:Ljava/security/MessageDigest;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c()Lul4;
    .locals 0

    .line 1
    iget-object p0, p0, Lj44;->o:Lul4;

    .line 2
    .line 3
    return-object p0
.end method
